package com.facebook.wearable.mediastream.codec;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.BT9;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.media.MediaCodec;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.codec.VideoDecoderBufferHandler$onOutputBuffer$1", f = "VideoDecoderBufferHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VideoDecoderBufferHandler$onOutputBuffer$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ MediaCodec.BufferInfo $decodeInfo;
    public final /* synthetic */ BT9 $decoderData;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoDecoderBufferHandler$onOutputBuffer$1(MediaCodec.BufferInfo bufferInfo, BT9 bt9, C30391dr r4) {
        super(2, r4);
        this.$decoderData = bt9;
        this.$decodeInfo = bufferInfo;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new VideoDecoderBufferHandler$onOutputBuffer$1(this.$decodeInfo, this.$decoderData, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C18090vk r0 = this.$decoderData.A00;
            if (r0 != null) {
                r0.invoke();
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VideoDecoderBufferHandler$onOutputBuffer$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
