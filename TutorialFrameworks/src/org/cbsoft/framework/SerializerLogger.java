package org.cbsoft.framework;

public class SerializerLogger implements Serializer {

	// proxy
	Serializer serializer;
	
	public SerializerLogger(Serializer serializer) {
		this.serializer = serializer;
	}

	@Override
	public void generateFile(String filename, Object obj) {
		System.out.println("Serializing " + filename);
		serializer.generateFile(filename, obj);
		System.out.println("Serialization for file " + filename + " finished!");
	}

	@Override
	public void setPostProcessor(PostProcessor pp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PostProcessor getPostProcessor() {
		// TODO Auto-generated method stub
		return null;
	}

}
