package patterns.dsa;

class SolutionTwo {
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // reverse nodes , start index = 1 , left <= right
    public static ListNode reverseBetween(ListNode head, int left, int right) {


        if(head == null) return null ;

        ListNode curr = head ;
        ListNode prev = null, startNode = head, endNode = null, nextToEndNode ;
        int count = 0;
        while(curr != null){
            count++;
            if(count == left - 1){
                prev = curr ;
                startNode = curr.next ;
            } else if(count == right){
                nextToEndNode = curr.next ;
                endNode = curr;
            }
            curr = curr.next ;
        }

        // 1->  4->3->2 -> 5
        ListNode next = startNode ;
        while(startNode != endNode){
            next = startNode.next ;
            startNode.next = prev ;
            prev = startNode ;
            startNode = next ;
        }
        System.out.print("start = " + startNode.val);
        System.out.print("prev = " + prev.val);
        // if(prev != null){
        //   prev.next = endNode;
        // } else{
        //   head = endNode ;
        // }
        return prev ;
    }

    public static void main(String[] args) {

        ListNode firstNode = new ListNode(1, null);
        ListNode secondNode = new ListNode(2, null);
        ListNode thirdNode = new ListNode(3, null);
        ListNode fourthNode = new ListNode(4, null);
        ListNode fifthNode = new ListNode(5, null);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;

        ListNode reverse = reverseBetween(firstNode, 2, 4);
        while(firstNode != null){
            System.out.print(firstNode.val);
            firstNode = firstNode.next ;
        }

    }
}


