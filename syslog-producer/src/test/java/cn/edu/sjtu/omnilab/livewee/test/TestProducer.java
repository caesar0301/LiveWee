package cn.edu.sjtu.omnilab.livewee.test;

import java.io.IOException;
import java.util.Properties;

import cn.edu.sjtu.omnilab.livewee.logproducer.ProducerSettings;
import kafka.javaapi.producer.Producer;
import kafka.producer.ProducerConfig;
import org.junit.Assert;
import org.junit.Test;

public class TestProducer {

    @Test
    public void testSettings() throws IOException {
        ProducerSettings settings = new ProducerSettings();
        Assert.assertEquals("arubasyslog", settings.topic);
    }

    @Test
    public void testProducerCreation() {
        String topic = "arubasyslog";
        Properties props = new Properties();
        props.put("metadata.broker.list", "10.50.4.73:9092");
        props.put("serializer.class", "kafka.serializer.StringEncoder");

        Producer<Integer, String> producer =
                new Producer<Integer, String>(new ProducerConfig(props));
    }
}
