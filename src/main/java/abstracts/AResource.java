package abstracts;

import utils.StringUtil;

abstract public class AResource {
	@Override
	public String toString() {
		return StringUtil.objToString(this);
	}
}
