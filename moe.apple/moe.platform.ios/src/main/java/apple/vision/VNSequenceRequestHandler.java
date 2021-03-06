package apple.vision;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.coreimage.CIImage;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNSequenceRequestHandler extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected VNSequenceRequestHandler(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNSequenceRequestHandler alloc();

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
    @Selector("init")
    public native VNSequenceRequestHandler init();

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
    @Selector("performRequests:onCGImage:error:")
    public native boolean performRequestsOnCGImageError(NSArray<? extends VNRequest> requests, CGImageRef image,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("performRequests:onCGImage:orientation:error:")
    public native boolean performRequestsOnCGImageOrientationError(NSArray<? extends VNRequest> requests,
            CGImageRef image, int orientation, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("performRequests:onCIImage:error:")
    public native boolean performRequestsOnCIImageError(NSArray<? extends VNRequest> requests, CIImage image,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("performRequests:onCIImage:orientation:error:")
    public native boolean performRequestsOnCIImageOrientationError(NSArray<? extends VNRequest> requests, CIImage image,
            int orientation, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("performRequests:onCVPixelBuffer:error:")
    public native boolean performRequestsOnCVPixelBufferError(NSArray<? extends VNRequest> requests,
            CVBufferRef pixelBuffer, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("performRequests:onCVPixelBuffer:orientation:error:")
    public native boolean performRequestsOnCVPixelBufferOrientationError(NSArray<? extends VNRequest> requests,
            CVBufferRef pixelBuffer, int orientation, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("performRequests:onImageData:error:")
    public native boolean performRequestsOnImageDataError(NSArray<? extends VNRequest> requests, NSData imageData,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("performRequests:onImageData:orientation:error:")
    public native boolean performRequestsOnImageDataOrientationError(NSArray<? extends VNRequest> requests,
            NSData imageData, int orientation, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("performRequests:onImageURL:error:")
    public native boolean performRequestsOnImageURLError(NSArray<? extends VNRequest> requests, NSURL imageURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("performRequests:onImageURL:orientation:error:")
    public native boolean performRequestsOnImageURLOrientationError(NSArray<? extends VNRequest> requests,
            NSURL imageURL, int orientation, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
}