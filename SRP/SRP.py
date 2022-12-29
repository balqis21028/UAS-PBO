class GeometricPersegiPanjang(object):
  
  def __init__(self, panjang: float, lebar: float):
    self.panjang = panjang
    self.lebar = lebar
    
  def area()-> float:
    return panjang*lebar
  

class PersegiPanjang(GeometricRectangle):
  
  def draw(self) -> VisualRepresentation:
    return visual_representation(self)

