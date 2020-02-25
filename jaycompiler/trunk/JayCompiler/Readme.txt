This is project works with this libraries:

  jflex >= 1.4.3
  cup   >= 11b
  antlr(3) >= 3.5.2

  This projects requires that these enviroment variables have been defined:
  
     * ANTLR_HOME - This points to dictory where ANTRL(3) was installed.
     * ANTLR_VERSION - Current version. This was tested with the 3.5.2

To run:
       java -cp $CLASSPATH:target/classes/ \
       co.edu.eafit.dis.st0270.jaycompiler.JayCompiler \
       examples/Example-01-Ok.jay
