package com.company;

/*

1014 Place a minimum of static
Place as few static modifiers as possible so that the example compiles.
Requirements:
1. The class must have a variable A.
2. The class must have a variable B.
3. The class must have a variable C.
4. The class must have a variable D.
5. The main method should not be changed.
6. Do not change the getA method.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args)
    {
        Main solution = new Main();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Main.D = 5 * D * C;

        Main.D = 5;
    }

    public int getA()
    {
        return A;
    }

}

















