class GeometricInterface(ABC):
  
  @abstractmethod
  def get_area() -> float:
    raise NotImplementedError

class ElipseInterface(GeometricInterface, ABC):
  
  @abstractmethod
  def get_diameter() -> float:
    raise NotImplementedError

class RectangleInterface(GeometricInterface, ABC):
  pass


class Square(Rectangle):

    def __init__(self, panjang: float, lebar: float):
        self.panjang = panjang
        self.lebar = lebar

    def get_area(self):
        return self.panjang * self.lebar

class Circle(Elipse):

    def __init__(self, radius: float):
        self.radius = radius

    def get_area(self):
        return self.radius * PI ** 2

    def get_diameter(self) -> float:
        return self.radius * 2
