@echo off

set CURRENT_DIRECTORY1=%CD%
xcopy /E %CURRENT_DIRECTORY1%\template %CURRENT_DIRECTORY1%\abc%1\

echo  package atcoder.abc%1.a;> %CURRENT_DIRECTORY1%\abc%1\a\Main.java
echo;>> %CURRENT_DIRECTORY1%\abc%1\a\Main.java
echo  import java.util.Scanner;>> %CURRENT_DIRECTORY1%\abc%1\a\Main.java
echo;>> %CURRENT_DIRECTORY1%\abc%1\a\Main.java
echo  public class Main {>> %CURRENT_DIRECTORY1%\abc%1\a\Main.java
echo      public static void main(String [] args) {>> %CURRENT_DIRECTORY1%\abc%1\a\Main.java
echo          try(Scanner scan = new Scanner(System.in)){>> %CURRENT_DIRECTORY1%\abc%1\a\Main.java
echo            System.out.println();>> %CURRENT_DIRECTORY1%\abc%1\a\Main.java
echo          }>> %CURRENT_DIRECTORY1%\abc%1\a\Main.java
echo      } >> %CURRENT_DIRECTORY1%\abc%1\a\Main.java
echo  }  >> %CURRENT_DIRECTORY1%\abc%1\a\Main.java

echo  package atcoder.abc%1.b;> %CURRENT_DIRECTORY1%\abc%1\b\Main.java
echo;>> %CURRENT_DIRECTORY1%\abc%1\b\Main.java
echo  import java.util.Scanner;>> %CURRENT_DIRECTORY1%\abc%1\b\Main.java
echo;>> %CURRENT_DIRECTORY1%\abc%1\b\Main.java
echo  public class Main {>> %CURRENT_DIRECTORY1%\abc%1\b\Main.java
echo      public static void main(String [] args) {>> %CURRENT_DIRECTORY1%\abc%1\b\Main.java
echo          try(Scanner scan = new Scanner(System.in)){>> %CURRENT_DIRECTORY1%\abc%1\b\Main.java
echo            System.out.println();>> %CURRENT_DIRECTORY1%\abc%1\b\Main.java
echo          }>> %CURRENT_DIRECTORY1%\abc%1\b\Main.java
echo      } >> %CURRENT_DIRECTORY1%\abc%1\b\Main.java
echo  }  >> %CURRENT_DIRECTORY1%\abc%1\b\Main.java

echo  package atcoder.abc%1.c;> %CURRENT_DIRECTORY1%\abc%1\c\Main.java
echo;>> %CURRENT_DIRECTORY1%\abc%1\c\Main.java
echo  import java.util.Scanner;>> %CURRENT_DIRECTORY1%\abc%1\c\Main.java
echo;>> %CURRENT_DIRECTORY1%\abc%1\c\Main.java
echo  public class Main {>> %CURRENT_DIRECTORY1%\abc%1\c\Main.java
echo      public static void main(String [] args) {>> %CURRENT_DIRECTORY1%\abc%1\c\Main.java
echo          try(Scanner scan = new Scanner(System.in)){>> %CURRENT_DIRECTORY1%\abc%1\c\Main.java
echo            System.out.println();>> %CURRENT_DIRECTORY1%\abc%1\c\Main.java
echo          }>> %CURRENT_DIRECTORY1%\abc%1\c\Main.java
echo      } >> %CURRENT_DIRECTORY1%\abc%1\c\Main.java
echo  }  >> %CURRENT_DIRECTORY1%\abc%1\c\Main.java

echo  package atcoder.abc%1.d;> %CURRENT_DIRECTORY1%\abc%1\d\Main.java
echo;>> %CURRENT_DIRECTORY1%\abc%1\d\Main.java
echo  import java.util.Scanner;>> %CURRENT_DIRECTORY1%\abc%1\d\Main.java
echo;>> %CURRENT_DIRECTORY1%\abc%1\d\Main.java
echo  public class Main {>> %CURRENT_DIRECTORY1%\abc%1\d\Main.java
echo      public static void main(String [] args) {>> %CURRENT_DIRECTORY1%\abc%1\d\Main.java
echo          try(Scanner scan = new Scanner(System.in)){>> %CURRENT_DIRECTORY1%\abc%1\d\Main.java
echo            System.out.println();>> %CURRENT_DIRECTORY1%\abc%1\d\Main.java
echo          }>> %CURRENT_DIRECTORY1%\abc%1\d\Main.java
echo      } >> %CURRENT_DIRECTORY1%\abc%1\d\Main.java
echo  }  >> %CURRENT_DIRECTORY1%\abc%1\d\Main.java

echo  package atcoder.abc%1.e;> %CURRENT_DIRECTORY1%\abc%1\e\Main.java
echo;>> %CURRENT_DIRECTORY1%\abc%1\e\Main.java
echo  import java.util.Scanner;>> %CURRENT_DIRECTORY1%\abc%1\e\Main.java
echo;>> %CURRENT_DIRECTORY1%\abc%1\e\Main.java
echo  public class Main {>> %CURRENT_DIRECTORY1%\abc%1\e\Main.java
echo      public static void main(String [] args) {>> %CURRENT_DIRECTORY1%\abc%1\e\Main.java
echo          try(Scanner scan = new Scanner(System.in)){>> %CURRENT_DIRECTORY1%\abc%1\e\Main.java
echo            System.out.println();>> %CURRENT_DIRECTORY1%\abc%1\e\Main.java
echo          }>> %CURRENT_DIRECTORY1%\abc%1\e\Main.java
echo      } >> %CURRENT_DIRECTORY1%\abc%1\e\Main.java
echo  }  >> %CURRENT_DIRECTORY1%\abc%1\e\Main.java

echo  package atcoder.abc%1.f;> %CURRENT_DIRECTORY1%\abc%1\f\Main.java
echo;>> %CURRENT_DIRECTORY1%\abc%1\f\Main.java
echo  import java.util.Scanner;>> %CURRENT_DIRECTORY1%\abc%1\f\Main.java
echo;>> %CURRENT_DIRECTORY1%\abc%1\f\Main.java
echo  public class Main {>> %CURRENT_DIRECTORY1%\abc%1\f\Main.java
echo      public static void main(String [] args) {>> %CURRENT_DIRECTORY1%\abc%1\f\Main.java
echo          try(Scanner scan = new Scanner(System.in)){>> %CURRENT_DIRECTORY1%\abc%1\f\Main.java
echo            System.out.println();>> %CURRENT_DIRECTORY1%\abc%1\f\Main.java
echo          }>> %CURRENT_DIRECTORY1%\abc%1\f\Main.java
echo      } >> %CURRENT_DIRECTORY1%\abc%1\f\Main.java
echo  }  >> %CURRENT_DIRECTORY1%\abc%1\f\Main.java