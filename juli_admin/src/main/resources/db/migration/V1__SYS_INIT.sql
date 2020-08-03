create table juli_sys_resource
(
    revision      int                                 null comment '乐观锁',
    id            varchar(64)                         not null comment '主键id'
        primary key,
    resource_url  varchar(255)                        null comment '访问路径',
    resource_name varchar(255)                        null comment '资源名称',
    resource_type varchar(255)                        null comment '资源类型',
    resource_code varchar(255)                        null comment '资源代码',
    parent_id     varchar(64)                         null comment '父节点id',
    icon          varchar(1024)                       null comment '图标',
    serial_number int       default 0                 null comment '序号',
    created_id    varchar(64)                         null comment '创建人id',
    created_name  varchar(255)                        null comment '创建人名字',
    created_time  timestamp default CURRENT_TIMESTAMP null comment '创建时间',
    updated_id    varchar(64)                         null comment '更新人id',
    updated_name  varchar(255)                        null comment '更新人名字',
    updated_time  timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    deleted       bit       default b'0'              null comment '是否删除',
    last_modify   timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '最后修改时间'
)
    comment '资源表';

create table juli_sys_role
(
    revision      int                                 null comment '乐观锁',
    id            varchar(64)                         not null comment '主键id'
        primary key,
    role_name     varchar(255)                        null comment '角色名称',
    role_code     varchar(255)                        null comment '角色代码',
    serial_number int       default 0                 null comment '序号',
    created_id    varchar(64)                         null comment '创建人id',
    created_name  varchar(255)                        null comment '创建人名字',
    created_time  timestamp default CURRENT_TIMESTAMP null comment '创建时间',
    updated_id    varchar(64)                         null comment '更新人id',
    updated_name  varchar(255)                        null comment '更新人名字',
    updated_time  timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    deleted       bit       default b'0'              null comment '是否删除',
    last_modify   timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '最后修改时间'
)
    comment '角色表';

create table juli_sys_role_resource
(
    revision     int                                 null comment '乐观锁',
    id           varchar(64)                         not null comment '主键id'
        primary key,
    union_code   varchar(64)                         null comment '关系代码',
    role_id      varchar(64)                         null comment '角色id',
    resource_id  varchar(64)                         null comment '资源id',
    created_id   varchar(64)                         null comment '创建人id',
    created_name varchar(255)                        null comment '创建人名字',
    created_time timestamp default CURRENT_TIMESTAMP null comment '创建时间',
    updated_id   varchar(64)                         null comment '更新人id',
    updated_name varchar(255)                        null comment '更新人名字',
    updated_time timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    deleted      bit       default b'0'              null comment '是否删除',
    last_modify  timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '最后修改时间'
)
    comment '资源表';

create table juli_sys_user
(
    revision                int                                 null comment '乐观锁',
    id                      varchar(64)                         not null comment '主键id'
        primary key,
    user_name               varchar(255)                        null comment '用户名字',
    nick_name               varchar(255)                        null comment '昵称',
    user_account            varchar(255)                        null comment '用户账号',
    user_type               varchar(10)                         null comment '用户类型',
    secret_code             varchar(255)                        null comment '密码',
    avatar                  varchar(1024)                       null comment '头像',
    account_non_expired     bit       default b'0'              null comment '账户是否过期',
    credentials_non_expired bit       default b'0'              null comment '凭据是否过期',
    account_non_locked      bit       default b'0'              null comment '账户是否锁定',
    created_id              varchar(64)                         null comment '创建人id',
    created_name            varchar(255)                        null comment '创建人名字',
    created_time            timestamp default CURRENT_TIMESTAMP null comment '创建时间',
    updated_id              varchar(64)                         null comment '更新人id',
    updated_name            varchar(255)                        null comment '更新人名字',
    updated_time            timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    deleted                 bit       default b'0'              null comment '是否删除',
    last_modify             timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '最后修改时间'
)
    comment '用户表';

create table juli_sys_user_role
(
    revision     int                                 null comment '乐观锁',
    id           varchar(64)                         not null comment '主键id'
        primary key,
    union_code   varchar(64)                         null comment '关系代码',
    user_id      varchar(64)                         null comment '用户id',
    role_id      varchar(64)                         null comment '角色id',
    created_id   varchar(64)                         null comment '创建人id',
    created_name varchar(255)                        null comment '创建人名字',
    created_time timestamp default CURRENT_TIMESTAMP null comment '创建时间',
    updated_id   varchar(64)                         null comment '更新人id',
    updated_name varchar(255)                        null comment '更新人名字',
    updated_time timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    deleted      bit       default b'0'              null comment '是否删除',
    last_modify  timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '最后修改时间'
)
    comment '资源表';

