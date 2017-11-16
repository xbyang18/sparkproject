package spark.product;

import org.apache.spark.sql.Column;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.expressions.MutableAggregationBuffer;
import org.apache.spark.sql.expressions.UserDefinedAggregateFunction;
import org.apache.spark.sql.types.DataType;
import org.apache.spark.sql.types.StructType;
import scala.collection.Seq;

public class GroupConcatDistinctUDAF extends UserDefinedAggregateFunction {
    public GroupConcatDistinctUDAF() {
        super();
    }

    @Override
    //指定输入数据的字段与类型
    public StructType inputSchema() {
        return null;
    }

    @Override
    //指定缓冲数据的字段与类型
    public StructType bufferSchema() {
        return null;
    }

    @Override
    //指定返回类型
    public DataType dataType() {
        return null;
    }

    @Override
    //指定是否是确定性的
    public boolean deterministic() {
        return false;
    }

    @Override
    /**
     * 初始化
     * 可以认为是，你自己在内部指定一个初始的值
     */
    public void initialize(MutableAggregationBuffer buffer) {

    }

    @Override
    /**
     * 更新
     * 可以认为是，一个一个地将组内的字段值传递进来
     * 实现拼接的逻辑
     */
    public void update(MutableAggregationBuffer buffer, Row input) {

    }

    @Override
    /**
     * 合并
     * update操作，可能是针对一个分组内的部分数据，在某个节点上发生的
     * 但是可能一个分组内的数据，会分布在多个节点上处理
     * 此时就要用merge操作，将各个节点上分布式拼接好的串，合并起来
     */
    public void merge(MutableAggregationBuffer buffer1, Row buffer2) {

    }

    @Override
    public Object evaluate(Row buffer) {
        return null;
    }

    @Override
    public Column apply(Seq<Column> exprs) {
        return super.apply(exprs);
    }

    @Override
    public Column apply(Column... exprs) {
        return super.apply(exprs);
    }

    @Override
    public Column distinct(Seq<Column> exprs) {
        return super.distinct(exprs);
    }

    @Override
    public Column distinct(Column... exprs) {
        return super.distinct(exprs);
    }
}
