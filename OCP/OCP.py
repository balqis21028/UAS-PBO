class User:

  def __init__(self, nama: str, usia: int):
      self.nama = nama
      self.usia = usia

  def __repr__(self):
      return f"User: {self.nama}, {self.usia} tahun"


class Gamer(User):

  def __init__(self, nama: str, usia: int, favorite_game: Game):
      super().__init__(nama, usia)
      self.favorite_game = favorite_game
      
  def __repr__(self):
    return f"User: {self.nama}, {self.usia} tahun, favorite game: {self.favorite_game}"
