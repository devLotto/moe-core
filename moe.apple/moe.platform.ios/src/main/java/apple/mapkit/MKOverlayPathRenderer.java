/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.mapkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.opaque.CGPathRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.mapkit.protocol.MKOverlay;
import apple.uikit.UIColor;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MKOverlayPathRenderer extends MKOverlayRenderer {
    static {
        NatJ.register();
    }

    @Generated
    protected MKOverlayPathRenderer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MKOverlayPathRenderer alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("applyFillPropertiesToContext:atZoomScale:")
    public native void applyFillPropertiesToContextAtZoomScale(CGContextRef context, @NFloat double zoomScale);

    @Generated
    @Selector("applyStrokePropertiesToContext:atZoomScale:")
    public native void applyStrokePropertiesToContextAtZoomScale(CGContextRef context, @NFloat double zoomScale);

    @Generated
    @Selector("createPath")
    public native void createPath();

    @Generated
    @Selector("fillColor")
    public native UIColor fillColor();

    @Generated
    @Selector("fillPath:inContext:")
    public native void fillPathInContext(CGPathRef path, CGContextRef context);

    @Generated
    @Selector("init")
    public native MKOverlayPathRenderer init();

    @Generated
    @Selector("initWithOverlay:")
    public native MKOverlayPathRenderer initWithOverlay(@Mapped(ObjCObjectMapper.class) MKOverlay overlay);

    @Generated
    @Selector("invalidatePath")
    public native void invalidatePath();

    @Generated
    @Selector("lineCap")
    public native int lineCap();

    @Generated
    @Selector("lineDashPattern")
    public native NSArray<? extends NSNumber> lineDashPattern();

    @Generated
    @Selector("lineDashPhase")
    @NFloat
    public native double lineDashPhase();

    @Generated
    @Selector("lineJoin")
    public native int lineJoin();

    @Generated
    @Selector("lineWidth")
    @NFloat
    public native double lineWidth();

    @Generated
    @Selector("miterLimit")
    @NFloat
    public native double miterLimit();

    @Generated
    @Selector("path")
    public native CGPathRef path();

    @Generated
    @Selector("setFillColor:")
    public native void setFillColor(UIColor value);

    @Generated
    @Selector("setLineCap:")
    public native void setLineCap(int value);

    @Generated
    @Selector("setLineDashPattern:")
    public native void setLineDashPattern(NSArray<? extends NSNumber> value);

    @Generated
    @Selector("setLineDashPhase:")
    public native void setLineDashPhase(@NFloat double value);

    @Generated
    @Selector("setLineJoin:")
    public native void setLineJoin(int value);

    @Generated
    @Selector("setLineWidth:")
    public native void setLineWidth(@NFloat double value);

    @Generated
    @Selector("setMiterLimit:")
    public native void setMiterLimit(@NFloat double value);

    @Generated
    @Selector("setPath:")
    public native void setPath(CGPathRef value);

    @Generated
    @Selector("setStrokeColor:")
    public native void setStrokeColor(UIColor value);

    @Generated
    @Selector("strokeColor")
    public native UIColor strokeColor();

    @Generated
    @Selector("strokePath:inContext:")
    public native void strokePathInContext(CGPathRef path, CGContextRef context);
}
