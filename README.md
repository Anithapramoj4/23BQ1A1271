# Campus Notification System - Stage 1

## Objective

Implement a Priority Inbox for campus notifications that displays the top 10 most important unread notifications based on notification type and recency.

## Priority Rules

* Placement = Highest Priority
* Result = Medium Priority
* Event = Lowest Priority

For notifications of the same type, newer notifications are given higher priority.

## Files

* `PriorityInbox.java` - Java implementation for finding top 10 priority notifications.
* `Notification_System_Design.md` - Design explanation and approach.
* `screenshots/` - Output and API response screenshots.

## Approach

1. Fetch notifications from the protected Notifications API.
2. Assign weights to notification types.
3. Sort notifications by:

   * Weight (descending)
   * Timestamp (descending)
4. Display the top 10 notifications.

## Output

The application prints the top 10 priority notifications in sorted order.
