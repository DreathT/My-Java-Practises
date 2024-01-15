public class Main {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        ListNode newList = mergedList;

        while(list1 != null && list2 != null){
            if(list2.val < list1.val){
                newList.val = list2.val;
                list2 = list2.next;
            }else{
                newList.val = list1.val;
                list1 = list1.next;
            }
            newList = newList.next;
        }
        return newList;
    }

    public static void main(String[] args) {

    }
}