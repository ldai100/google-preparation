public class OneTwoSixFive {

    // Initial solution. This cannot be run here due to the use of interface unknown;
    public void printLinkedListInReverse(ImmutableListNode head) {
        Stack<ImmutableListNode> helper = new Stack();

        while(head != null) {
            helper.push(head);
            head = head.getNext();
        }

        while(!helper.empty()) {
            helper.peek().printValue();
            helper.pop();
        }
    }
}
