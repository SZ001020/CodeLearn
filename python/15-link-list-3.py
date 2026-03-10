class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LinkList:
    def __init__(self):
        self.head_node = None
        self.length = 0

    def insert(self,data):
        new_node = Node(data)
        self.length += 1
        if self.head_node is None:
            self.head_node = new_node
            return self.head_node
        
        current_node = self.head_node
        while current_node.next is not None:
            current_node =current_node.next
        current_node.next = new_node
        return new_node

    def print_link_list(self):
        current_node = self.head_node
        while current_node is not None:
            if current_node.next is not None:
                print(current_node.data,end=" ")
            else:
                print(current_node.data)
            current_node = current_node.next

    def get(self,position):
        
        if position < 1 or position > self.length:
            return None
        i = 1
        current_node = self.head_node
        while current_node is not None:

            if i == position:
                return current_node
            i += 1
            current_node = current_node.next
        return None
    
    
    def insert_at(self,n,data):
        new_node = Node(data)
        if n==1:
            new_node.next = self.head_node
            self.head_node = new_node
            self.length += 1
            return new_node
        else:
            preNode = self.get(n-1)
            if preNode is not None:
                new_node.next = preNode.next
                preNode.next = new_node
                self.length += 1
                return new_node
        return None

    def delete(self,n):
        if self.head_node is None:
            return None
        if n == 1:
            delete_node = self.head_node
            self.head_node = self.head_node.next
            self.length -= 1
            return delete_node
        else:
            pre_node = self.get(n-1)
            if pre_node is not None and pre_node.next is not None:
                delete_node = pre_node.next
                pre_node.next = pre_node.next.next
                self.length -= 1
                return delete_node
        return None


k = int(input())
nums = list(map(int, input().split()))
link_list = LinkList()

for num in nums:
    link_list.insert(num)
            
s = int(input())

for _ in range(s):

    insert_data = list(map(int, input().split()))

        
    objective_node = link_list.insert_at(insert_data[0], insert_data[1])

    if objective_node is not None:
            
        link_list.print_link_list()
    else:
        print("Insertion position is invalid.")
    
l = int(input())

for _ in range(l):

    delete_position = int(input())
        
    deleted_node = link_list.delete(delete_position)
    if deleted_node is not None:
        link_list.print_link_list()
    else:
        print("Deletion position is invalid.")