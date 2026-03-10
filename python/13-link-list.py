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

while True:
    try:
        n =int(input())
        s=list(map(int,input().split()))
    except:
        break

    link_list = LinkList()
    for element in s:
        link_list.insert(element)
    link_list.print_link_list()