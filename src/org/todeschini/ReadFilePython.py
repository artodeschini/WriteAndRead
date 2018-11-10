from pathlib import Path

file = str(Path.home()) + "/python.txt"

with open(file) as f:
    content = f.read().splitlines()

print( content )