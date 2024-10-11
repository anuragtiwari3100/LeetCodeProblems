

class Solution {
  public int smallestChair(int[][] times, int targetFriend) {
    int nextChair = 0;
    PriorityQueue<Integer> freeChairs = new PriorityQueue<>();
    PriorityQueue<int[]> occupiedChairs = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

    for (int i = 0; i < times.length; ++i) {
      times[i] = Arrays.copyOf(times[i], 3);
      times[i][2] = i;
    }

    Arrays.sort(times, Comparator.comparingInt(a -> a[0]));

    for (int[] t : times) {
      int arrival = t[0];
      int leave = t[1];
      int personIdx = t[2];

      while (!occupiedChairs.isEmpty() && occupiedChairs.peek()[0] <= arrival) {
        freeChairs.add(occupiedChairs.poll()[1]);
      }

      if (personIdx == targetFriend) {
        return freeChairs.isEmpty() ? nextChair : freeChairs.peek();
      }

      int assignedChair = freeChairs.isEmpty() ? nextChair++ : freeChairs.poll();
      occupiedChairs.add(new int[]{leave, assignedChair});
    }

    throw new IllegalArgumentException();
  }
}
