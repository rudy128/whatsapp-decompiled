package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderDelegateBridge;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate;
import com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchGesturesDataProviderConfigurationHybrid;

/* renamed from: X.C5m  reason: case insensitive filesystem */
public abstract class C24472C5m {
    public ServiceConfiguration A00() {
        AvatarsDataProviderDelegateBridge avatarsDataProviderDelegateBridge;
        if (this instanceof BQV) {
            return new TouchGesturesDataProviderConfigurationHybrid((BQV) this);
        }
        if (this instanceof BQU) {
            return new InstructionServiceConfigurationHybrid((BQU) this);
        }
        if (this instanceof GalleryPickerServiceConfiguration) {
            return new GalleryPickerServiceConfigurationHybrid((GalleryPickerServiceConfiguration) this);
        }
        if (this instanceof BQR) {
            return new CaptureEventServiceConfigurationHybrid((BQR) this);
        }
        if (!(this instanceof BQZ)) {
            return null;
        }
        BQZ bqz = (BQZ) this;
        AvatarsDataProviderConfigurationHybrid avatarsDataProviderConfigurationHybrid = AvatarsDataProviderConfigurationHybrid.$redex_init_class;
        String str = bqz.A03;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = bqz.A02;
        if (str3 != null) {
            str2 = str3;
        }
        C24765CJf cJf = bqz.A00;
        if (cJf != null) {
            avatarsDataProviderDelegateBridge = new AvatarsDataProviderDelegateBridge(cJf);
        } else {
            avatarsDataProviderDelegateBridge = null;
        }
        AvatarsNativeInputDelegate avatarsNativeInputDelegate = bqz.A01;
        if (avatarsNativeInputDelegate == null) {
            avatarsNativeInputDelegate = new AvatarsNativeInputDelegate();
        }
        return new ServiceConfiguration(AvatarsDataProviderConfigurationHybrid.initHybrid(str, str2, 3, avatarsDataProviderDelegateBridge, avatarsNativeInputDelegate));
    }
}
