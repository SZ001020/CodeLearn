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

n,k = map(int, input().split())

link_list = LinkList()

elements = list(map(int, input().split()))

for element in elements:
    link_list.insert(element)

m_values = list(map(int, input().split()))


for m in m_values:
    if m < 1 or m > link_list.length:
        print("Output position out of bounds.")
    else:
        current_node = link_list.head_node
        for i in range(m-1):
            current_node = current_node.next
        print(current_node.data)
# solution 02
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
            print("Output position out of bounds.")
        else:
            current_node = self.head_node
            for i in range(position - 1):
                current_node = current_node.next
            print(current_node.data)



n,k = map(int, input().split())

link_list = LinkList()

elements = list(map(int, input().split()))

for element in elements:
    link_list.insert(element)

m_values = list(map(int, input().split()))

for m in m_values:
    link_list.get(m)