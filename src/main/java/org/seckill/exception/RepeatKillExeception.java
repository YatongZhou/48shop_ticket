package org.seckill.exception;

/**
 * 异常处理
 *
 */
public class RepeatKillExeception extends SeckillException{

	public RepeatKillExeception(String message) {
		super(message);
	}
	
	public RepeatKillExeception(String message, Throwable cause) {
		super(message,cause);
	}
	
}
