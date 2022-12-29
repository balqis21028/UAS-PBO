class T:
  
  def __init__(self, phi: list):
    self.phi = phi
    
class S(T):
  pass

if __name__ == "__main__":
  x = T(phi=["a", "b"])
  y = S(phi=["c", "d"])
