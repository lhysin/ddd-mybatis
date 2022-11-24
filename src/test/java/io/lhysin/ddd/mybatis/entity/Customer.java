package io.lhysin.ddd.mybatis.entity;

import io.lhysin.ddd.mybatis.spec.*;

import lombok.*;

@Getter
@Table(name = "CUSTOMER", schema = "ADM")
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Customer {

    @Id
    @Column(name = "CUST_NO")
    @EqualsAndHashCode.Include
    private String custNo;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "AGE")
    private Integer age;

    public void plusAge(Integer age) {
        this.age = this.age + age;
    }
}