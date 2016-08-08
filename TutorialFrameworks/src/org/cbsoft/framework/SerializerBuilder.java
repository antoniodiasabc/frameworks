package org.cbsoft.framework;

public class SerializerBuilder {

	private Serializer serializer;
	
	public SerializerBuilder createXMLSerializer(){
		serializer = new FileSerializer(new NullPostProcessor(), new XMLFormatter());
		return this;// para interface fluente
	}
	
	public SerializerBuilder createPropertiesSerializer(){
		serializer = new FileSerializer(new NullPostProcessor(), new XMLFormatter());
		return this;// para interface fluente
	}
	
	public SerializerBuilder withCompression(){
		PostProcessor pp = new Compressor();
		addPostProcessor(pp);
		return this;
	}
	
	public SerializerBuilder withEncription(int number){
		PostProcessor pp = new Crypto(number);
		addPostProcessor(pp);
		return this;
	}
	
	public SerializerBuilder withLogging(){
		serializer = new SerializerLogger(serializer);
		return this;
	}
	
	public void addPostProcessor(PostProcessor pp){
		PostProcessor current = serializer.getPostProcessor();
		if(current instanceof NullPostProcessor){
			serializer.setPostProcessor(pp);
		}else {
			CompositePostProcessor comp = new CompositePostProcessor(current, pp);
			serializer.setPostProcessor(comp);
		}
	}
	
	public Serializer build(){
		return serializer;
	}
}
