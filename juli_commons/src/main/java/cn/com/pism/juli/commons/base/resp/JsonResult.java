package cn.com.pism.juli.commons.base.resp;

import cn.com.pism.juli.commons.enums.RespCode;
import lombok.Data;

/**
 * 响应
 *
 * @author PerccyKing
 * @version 1.0
 * @date  2019/03/18 下午 04:31
 */
@Data
public class JsonResult<T> {
    /**
     * 响应代码
     */
    private Integer code = RespCode.SUCCESS.code();
    /**
     * 响应信息
     */
    private String msg = "操作成功";
    /**
     * 响应数据
     */
    private T data;
    /**
     * 时间戳
     */
    private Long ts = System.currentTimeMillis();

    public JsonResult() {
    }

    public JsonResult(T data) {
        this(RespCode.SUCCESS, data);
    }

    public JsonResult(RespCode code) {
        this(code, null);
    }

    public JsonResult(RespCode code, T data) {
        this.code = code.code();
        this.msg = code.msg();
        this.data = data;
        ts = System.currentTimeMillis();
    }

}
