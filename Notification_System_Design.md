# Stage 1

## Priority Inbox Design

The Priority Inbox ranks unread notifications using two factors:

### Notification Type Weight

* Placement = 3
* Result = 2
* Event = 1

Higher-weight notifications are displayed before lower-weight notifications.

Notifications are fetched from the protected Notifications API using a Bearer token obtained through the Authentication API.

### Recency

For notifications of the same type, newer notifications are displayed before older notifications.

## Approach

1. Read the notifications.
2. Assign a priority using notification type.
3. Sort notifications by:

   * Type weight (descending)
   * Timestamp (descending)
4. Display the top 10 notifications.

## Efficient Maintenance of Top 10

As new notifications arrive continuously, a Min Heap (PriorityQueue) of size 10 can be used.

* Insert each incoming notification into the heap.
* If the heap size exceeds 10, remove the lowest-priority notification.
* The heap always contains the current top 10 notifications.

## Complexity

Current implementation:

* Time Complexity: O(n log n)
* Space Complexity: O(n)

Heap-based optimization:

* Time Complexity: O(n log 10)
* Space Complexity: O(10)

