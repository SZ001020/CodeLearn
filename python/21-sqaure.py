class Shape:
    def __init__(self, shape_type):
        self.type = shape_type
    
    def calculate_area(self):
        pass
    
class Rectangle(Shape):
    
    def __init__(self, width, height):
        super().__init__("Rectangle")
        self.width = width
        self.height =  height
    
    def calculate_area(self):
        return self.width*self.height
    
class Circle(Shape):

    def __init__(self, radius):
        super().__init__("Circle")
        self.radius = radius
    
    def calculate_area(self):
        return 3.14*self.radius*self.radius

shapes = []


while True:
    data = input().split()
    shape = data[0]
    if shape == 'rectangle':
        width, height = float(data[1]),float(data[2])

        shapes.append(Rectangle(width,height))

    elif shape == 'circle':
        radius = float(data[1])
        shapes.append(Circle(radius))


    elif shape == 'end':
        break
for shape in shapes:
    print(f"{shape.type} area: {shape.calculate_area():.2f}")