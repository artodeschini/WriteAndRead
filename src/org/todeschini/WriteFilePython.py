from pathlib import Path

file = str(Path.home()) + "/python.txt"
print()

f = open(file, 'w')

f.write(
    "Hello there," +
    " here is some text. In the same line\n" +# python will convert \n to os.linesep
    "We are writing" +
    " the text to the file. Another line")

f.close()  # you can