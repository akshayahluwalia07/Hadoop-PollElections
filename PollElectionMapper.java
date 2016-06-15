import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class PollElectionMapper extends Mapper<LongWritable, Text, Text, IntWritable>
{

	private final static IntWritable one= new IntWritable(1);

	@Override
	public void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException
	{
	
		context.write(value, one);

	}
		
}
