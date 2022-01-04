
# STREAM

In Java, streams are the sequence of data that are read from the source and written to the destination. Java provides I/O Streams to read and write data where, a Stream represents an input source or an output destination which could be a file, i/o devise, other program etc.

```java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}
```
In the above program, we have used `System.out` to print a string. Here, the `System.out` is a type of output stream.

## Types of Streams 
Depending upon the data a stream holds, it can be classified into:

* __Byte Stream__ : It is used to read and write a single byte (8 bits) of data.
* __Character Stream__ : It is used to read and write a single character of data.

---
# OBJECT STREAM
* Object streams support I/O of objects, just as data streams supports I/O of primitive data types. The object stream classes are `ObjectInputStream` and `ObjectOutputStream`.<br>
* The `ObjectInputStream` class of the `java.io` package can be used to read objects that were previously written by `ObjectOutputStream`.<br>
* The process of writing an object to an output stream is called __Serialization__.<br>
* The process of reconstructing an object from an input stream is called __deserialization__.

---
# ZIP FILE STREAM
* Zip files are basically an archive file that is used to compress all the files in one place. Doing this reduces memory space occupied and makes transport of files bundle easy.
* In Java, there are two classes namely ZipFile and ZipInputStream which are used to read the file entries present in zip files. Both the classes are found inside the java.util.zip class, and both classes implement the closeable interface as they are both very useful in reading and extracting zip files.
* ZipFile class is used to read the files which are compressed into a zip file. This class provides several methods to access the entries in the zip file.
  * `ZipEntry getEntry(String name)`
  * ` InputStream getInputStream(ZipEntry entry)`
  * `Enumeration<? extends ZipEntry> entries()`
* ZipInputStream class also used to get the entries and the metadata of the files present in the zip file. This class also implements the same methods as the above class does, except the two methods namely as follows:
  * `getInputStream()`
  * `Enumeration<? extends ZipEntry> entries()`
  ---
