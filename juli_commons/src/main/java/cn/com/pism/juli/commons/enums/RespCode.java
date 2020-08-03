package cn.com.pism.juli.commons.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * 响应代码
 * <pre>
 * 1XX：收到请求，处理未成功
 * 2XX：成功
 * 4XX：客户端错误
 * 500：服务端错误
 * 3XX：***
 * </pre>
 *
 * @author wangyihuai
 * @version 0.0.1
 * @date 2020/08/01 下午 10:00
 * @since 0.0.1
 */
public enum RespCode {
    /**
     * 操作成功
     */
    SUCCESS(200, "操作成功"),
    /**
     * 操作失败
     */
    ERROR(500, "操作失败");

    RespCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Getter
    @Setter
    private Integer code;

    @Getter
    @Setter
    private String msg;

    public Integer code() {
        return code;
    }

    public String msg() {
        return msg;
    }

    /**
     * 根据code获取信息
     * @param code 响应代码
     * @return 响应信息
     * @author PerccyKing
     * @date 2020/08/01 下午 10:23
     */
    public String getByCode(Integer code) {
        RespCode[] values = RespCode.values();
        for (RespCode value : values) {
            if (code.equals(value.code())){
                return value.msg();
            }
        }
        return null;
    }

}
