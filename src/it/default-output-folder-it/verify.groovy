File pomFile = new File( basedir, "target/generated-sources/kubeless/pom.xml" );
File classFile = new File( basedir, "target/generated-sources/kubeless/AppFunction.java" );

assert classFile.isFile()
assert pomFile.isFile()
