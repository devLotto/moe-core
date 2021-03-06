package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDragSession")
public interface UIDragSession extends UIDragDropSession {
    @Generated
    @Selector("localContext")
    @MappedReturn(ObjCObjectMapper.class)
    Object localContext();

    @Generated
    @Selector("setLocalContext:")
    void setLocalContext(@Mapped(ObjCObjectMapper.class) Object value);
}