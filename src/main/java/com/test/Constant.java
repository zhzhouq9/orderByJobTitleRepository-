package com.test;/**
 * @author zhzhouq
 * @date 2020-10-14 - 18:07
 */

/**
 * 类名称: Constant
 * 类描述：(这里用一句话描述这个类的作用)
 * 创建时间: 2020-10-14 21:01
 * 创建人： zhzhouq
 * 版本： 1.0
 */
public class Constant {

    /**
     * 方法名称：<br>
     * 方法描述：该常量类是用来 处理 企业领导职位的，我加这个常量类的原因就是因为
     * 每个公司的职位其实都是固定的，很少有变化的情况，就算有变化的情况也不需要害怕，
     * 咱们可以把这些内容配置在配置文件中，动态的让系统去加载即可
     * 然后咱们按照常量类 所对应的  编号处理
     * <br>
     * 方法参数:
     * 方法返回值: 
     * 创建时间: 2020-10-14 21:03<br>
     * 创建人： zhzhouq<br>
     * 版本： 1.0<br>
     */
    public static class JobTitleOrderId{

        public static final long CHAIRMAN = 1; //董事长

        public static final long VICE_CHAIRMAN = 2; //副董事长

        public static final long EXECUTIVE_DIRECTOR = 3; //执行董事

        public static final long DIRECTOR = 4; //董事

        public static final long SUPERVISOR = 5; //监事

        public static final long OTHER = 6; //其他

        public static final String getName(long orderId)
        {
            String strReturn = ""; //初始化返回值
            switch ((int) orderId)
            {
                case (int) CHAIRMAN:
                    strReturn = "董事长";
                    break;
                case (int) VICE_CHAIRMAN:
                    strReturn = "副董事长";
                    break;
                case (int) EXECUTIVE_DIRECTOR:
                    strReturn = "执行董事";
                    break;
                case (int) DIRECTOR:
                    strReturn = "董事";
                    break;
                case (int) SUPERVISOR:
                    strReturn = "监事";
                    break;
                case (int) OTHER:
                    strReturn = "其他";
                    break;
            }
            return strReturn;
        }
        public static final long getOrdeId(String code)
        {
            long lReturn =-1; //初始化返回值
            switch ((String) code)
            {
                case "董事长":
                    lReturn = CHAIRMAN;
                    break;
                case "总经理":
                    lReturn = CHAIRMAN;
                    break;
                case "副董事长":
                    lReturn = VICE_CHAIRMAN;
                    break;
                case "执行董事":
                    lReturn = EXECUTIVE_DIRECTOR;
                    break;
                case "董事":
                        lReturn = DIRECTOR;
                    break;
                case "监事":
                    lReturn = SUPERVISOR;
                    break;
                case "其他职位":
                    lReturn = OTHER;
                    break;
                case "":
                    lReturn = OTHER;
                    break;
            }
            return lReturn;
        }
    }
}