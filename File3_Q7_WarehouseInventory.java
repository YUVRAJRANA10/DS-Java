/**
 * ============================================================
 * QUESTION: Warehouse Inventory Manager
 * FILE: 3 | QUESTION: 7
 * ============================================================
 * 
 * STATEMENT:
 * Implement adding items to the tail of a Singly Linked List inventory.
 * 
 * CLASSIFICATION: Linked List
 * 
 * TEST CASES:
 * Case 1: [Apple] + [Banana] → [Apple, Banana]
 * Case 2: [Empty] + [Orange] → [Orange]
 * 
 * ALGORITHM:
 * Traverse to end and update last->next.
 * 
 * SIMILAR QUESTIONS:
 * 1. Delete Node
 * 2. Merge Inventories
 * 3. Sorted List Insertion
 * ============================================================
 */

public class File3_Q7_WarehouseInventory {
    
    // Node class for inventory items
    static class ItemNode {
        String name;
        int quantity;
        ItemNode next;
        
        ItemNode(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
            this.next = null;
        }
    }
    
    // TODO: Implement the Inventory class
    static class Inventory {
        private ItemNode head;
        private ItemNode tail;
        private int size;
        
        public Inventory() {
            // Initialize
               head = null;
               tail = null;
               size = 0;
        }
        
        /**
         * Add item to the end of inventory
         * @param name - item name
         * @param quantity - item quantity
         */
        public void addItem(String name, int quantity) {
            // YOUR CODE HERE
            if(head == null){
            ItemNode newnode = new ItemNode(name,quantity);
            newnode.next =head;
            head = newnode;
            tail = newnode;
            
            }
            else{
            ItemNode newnode = new ItemNode(name,quantity);
            tail.next = newnode;
            tail = newnode;
            
            

            }
        }
        
        /**
         * Remove item by name
         * @param name - item name to remove
         * @return - true if removed, false if not found
         */
        public boolean removeItem(String name) {
            // YOUR CODE HERE
            if (head == null) {
                return false;
            }
           
            ItemNode temp =  head;
            while(temp.next!= null){
                if(temp.next.name == name){
                   temp.next = temp;
                }
            }
            return false;
        }
        
        /**
         * Find item by name
         * @param name - item name
         * @return - ItemNode if found, null otherwise
         */
        public ItemNode findItem(String name) {
                    if (head == null) {
                return null;
            }
           
            ItemNode temp =  head;
            while(temp!= null){
                if(temp.name == name){
                    return temp;
                }
                temp = temp.next;
            }
          
              

            return null;
        }
        
        /**
         * Get inventory size
         */
        public int getSize() {
                        if (head == null) {
                return 0;
            }
           int count = 0;
            ItemNode temp =  head;
            while(temp!= null){
                temp = temp.next;
                count++;
            }
          return count;
        }
        
        /**
         * Display inventory
         */
        public void display() {
            ItemNode curr = head;
            System.out.print("[");
            while (curr != null) {
                System.out.print(curr.name + "(" + curr.quantity + ")");
                if (curr.next != null) System.out.print(" → ");
                curr = curr.next;
            }
            System.out.println("]");
        }
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 3 - Q7: Warehouse Inventory Manager ===\n");
        
        Inventory inventory = new Inventory();
        
        // Test Case 1
        System.out.println("Test 1: Add Apple, then Banana");
        inventory.addItem("Apple", 10);
        inventory.addItem("Banana", 20);
        inventory.display();
        System.out.println("Expected: [Apple(10) → Banana(20)]");
        System.out.println("Size: " + inventory.getSize() + " (Expected: 2)");
        System.out.println("Status: " + (inventory.getSize() == 2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        System.out.println("Test 2: Add Orange");
        inventory.addItem("Orange", 15);
        inventory.display();
        System.out.println("Expected: [Apple(10) → Banana(20) → Orange(15)]");
        System.out.println("Status: " + (inventory.getSize() == 3 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3 - Find
        System.out.println("Test 3: Find Banana");
        ItemNode found = inventory.findItem("Banana");
        System.out.println("Found: " + (found != null ? found.name + "(" + found.quantity + ")" : "null"));
        System.out.println("Status: " + (found != null && found.quantity == 20 ? "✓ PASSED" : "✗ FAILED"));
    }
}
