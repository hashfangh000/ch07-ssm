ch07-ssm : ssm ���Ͽ���
springmvc : ��ͼ�㣬 ����㣬 �����������ģ���ʾ������

Spring��ҵ��㣬����service��dao �� ������Ŀ���

Mybatis�� �־ò㣬 �������ݿ��

�û���������--springmvc����---spring�е�service����---Mybatis��������

ssm���� Ҳ����ssi(IbatisҲ����Mybatis��ǰ��),��������������
   1.��һ������SpringMVC����������Controller���ƶ����
   2.�ڶ�������Spring����������Service�� Dao����������
 ����Ҫ�����ǰ�ʹ�õĶ��󽻸� ���ʵ����������� ���� ��Controller����web��������ض���
 ����springmvc��������Щweb�õĶ���д��springmvc�����ļ���

 service�� dao ��������spring�����ļ��У���spring������Щ����



 springmvc������spring�������й�ϵ��
 springmvc������spring������������������java�ļ̳С��ӿ��Է��ʸ�������
 ���������е�Controller���Է��ʸ������е�service���� �Ϳ���ʵ��controllerʹ��service����

 ʹ�ò��裺
    0.ʹ��springdb��mysql�⣬ ��ʹ��student(id auto-increment, name, age)
    1.�½�maven web��Ŀ
    2.��������
        springmvc, spring mybatis������ܵ�������Jackson������mysql������Druid���ӳ�
        jsp, servlet ����
    3.дweb.xml
        1)ע��DispatchServlet �� Ŀ�� ��1 ����springmvc�������󣬲��ܴ���Controller�����
                                      2 ��������servlet�� ���ܽ����û�������
        2)ע��spring�ļ�����ContextLoaderListener Ŀ�ģ�����spring���������󣬲��ܴ���service��dao�ȶ���
        3)ע���ַ����������� ���post�������������

    4����������controller�� service���� dao �� ʵ�������������

    5.дspringmvc��spring��mybatis�������ļ�
        1)springmvc�����ļ�
        2)spring�����ļ�
        3)mybatis�����ļ�
        4)���ݿ�����������ļ�
    6.д���룬dao�ӿں�mapper�ļ���service��ʵ���࣬controller�� ʵ���ࡣ
    7.дjspҳ��
