package X;

import com.facebook.wamediajni.WamediaStreamsMP4Muxer;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.3Eh  reason: invalid class name and case insensitive filesystem */
public class C71193Eh extends PhantomReference {
    public final WamediaStreamsMP4Muxer.NativeWrapper A00;

    public C71193Eh(WamediaStreamsMP4Muxer.NativeWrapper nativeWrapper, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.A00 = nativeWrapper;
    }
}
