package com.test;

import org.junit.jupiter.api.Test;

import java.util.*;
/**
 * 类名称: TestMain
 * 类描述：测试类入口
 * 创建时间: 2020-10-14 21:10
 * 创建人： zhzhouq
 * 版本： 1.0
 */
public class TestMain {

    @Test
    public void orderByJobTitle() {

        long [] tempId =  new long [10];
        long ordeId = -1L;

        //该arrayList数据我手动初始化，正常情况下是查询数据库查询出来的
        List<LeadEntity> arrayList = new ArrayList<LeadEntity>();
        arrayList.add(new LeadEntity(2, "周绍钦", "副董事长"));
        arrayList.add(new LeadEntity(1, "马化腾", "总经理,董事长"));
        arrayList.add(new LeadEntity(4, "黄秋华", "监事"));
        arrayList.add(new LeadEntity(3, "张天昊", "副董事长"));
        arrayList.add(new LeadEntity(6, "颜庆玲", "执行董事"));
        arrayList.add(new LeadEntity(5, "刘华", "监事"));
        arrayList.add(new LeadEntity(9, "张项羽", ""));
        arrayList.add(new LeadEntity(7, "邵恺", "执行董事"));
        arrayList.add(new LeadEntity(9, "吴瑜", "其他职位"));
        arrayList.add(new LeadEntity(10, "吕渴欣", ""));
        arrayList.add(new LeadEntity(9, "魏关红", "其他职位"));

        int size = arrayList.size();
        for(int i=0;i<size;i++){
            System.out.println("排序前：="+arrayList.get(i).toString());
            LeadEntity leadEntity = (LeadEntity)arrayList.get(i);

            System.out.println("处理orderId逻辑***************start");
            //处理职位有多个的逻辑，多个职位之间使用逗号
            if(leadEntity.getJobTitle().indexOf(",")>0){
                String[] split = leadEntity.getJobTitle().split(",");
                for(int p=0;p<split.length;p++){
                    tempId [p] = Constant.JobTitleOrderId.getOrdeId(split[p]);
                }
                //排序这个数组，拿到最小的值
                orderArray(tempId);
                ordeId = tempId[0];
                leadEntity.setOrderId(ordeId);

            }else{
                //处理，职位没有逗号的逻辑
                ordeId = Constant.JobTitleOrderId.getOrdeId(leadEntity.getJobTitle());
                leadEntity.setOrderId(ordeId);
            }
        }

        //对集合进行排序
        Collections.sort(arrayList, new Comparator<LeadEntity>() {
            @Override
            public int compare(LeadEntity o1, LeadEntity o2) {
                if (o1.getOrderId() > o2.getOrderId()) {
                    return 1;
                } else if (o1.getOrderId() < o2.getOrderId()) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println("排序之后*************************************排序之后*************************************排序之后*************************************");

        for(int i=0;i<size;i++){
            System.out.println("排序后：="+arrayList.get(i).toString());
        }
    }
    public void orderArray(long [] arr){
        long min = 1;                          // 创建最小数变量
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]) {                 // 提取最小整数
                min = arr[j];
            }
        }
    }
}