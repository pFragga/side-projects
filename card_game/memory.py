# memory.py

""" MEMORY CARD GAME

AUTHOR: Petros Frangatzis
Date: 25/Feb/22
"""

# DECK OF CARDS:
# digits: 2, 3, ..., 10, J, Q, K, A
# symbols: ♠, ♥, ♣, ♦

# DIGIT VALUES:
# 2, 3, ..., 10: their respective number.
# J, Q, K: 10: 10pt(s)
# A: 1pt(s)


class Card:
    def __init__(self, digit, symbol) -> None:
        self.digit = digit
        self.symbol = symbol

    def __str__(self) -> str:
        return self.digit + self.symbol





if __name__ == '__main__':

    samplecard = Card('2', '♠')
    print(samplecard.__str__())



