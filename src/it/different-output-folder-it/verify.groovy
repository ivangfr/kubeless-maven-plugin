File pomFile = new File( basedir, "target/generated-sources/another-folder/pom.xml" );
File classFile = new File( basedir, "target/generated-sources/another-folder/AppFunction.java" );

assert classFile.isFile()
assert pomFile.isFile()
