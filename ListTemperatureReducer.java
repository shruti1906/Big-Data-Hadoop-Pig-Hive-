// cc ListTemperatureReducer Reducer for List temperature example
// vv ListTemperatureReducer
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class ListTemperatureReducer
  extends Reducer<Text, IntWritable, Text, IntWritable> {
  
  @Override
  public void reduce(Text key, Iterable<IntWritable> values,
      Context context)
      throws IOException, InterruptedException {
    
	
    //int maxValue = Integer.MIN_VALUE;
	    //for (IntWritable value : values) {
      //maxValue = Math.max(maxValue, value.get());
    //}
	//context.write(key, new IntWritable(maxValue));
		for (IntWritable value : values) {
			context.write(key, new IntWritable(value.get()));
		}
	
	}
}
// ^^ ListTemperatureReducer
