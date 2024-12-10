package com.whatsapp.ml.v2.compression;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6SE;
import X.AnonymousClass6SI;
import X.AnonymousClass708;
import X.AnonymousClass9N9;
import X.C108945cZ;
import X.C124426Yh;
import X.C162178Jk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C35911n2;
import X.C64062u9;
import com.facebook.cameracore.ardelivery.compression.tarbrotli.TarBrotliDecompressor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.compression.BrotliDecompressor$process$2", f = "BrotliDecompressor.kt", i = {0}, l = {76}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
public final class BrotliDecompressor$process$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass708 $model;
    public final /* synthetic */ String $targetFilePath;
    public final /* synthetic */ File $tempFile;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ BrotliDecompressor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrotliDecompressor$process$2(AnonymousClass708 r2, BrotliDecompressor brotliDecompressor, File file, String str, C30391dr r6) {
        super(2, r6);
        this.$targetFilePath = str;
        this.$tempFile = file;
        this.this$0 = brotliDecompressor;
        this.$model = r2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        String str = this.$targetFilePath;
        File file = this.$tempFile;
        return new BrotliDecompressor$process$2(this.$model, this.this$0, file, str, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass708 r6;
        File file;
        C35911n2 r2;
        String str;
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r2 = C124426Yh.A00;
            str = this.$targetFilePath;
            file = this.$tempFile;
            BrotliDecompressor brotliDecompressor = this.this$0;
            r6 = this.$model;
            this.L$0 = r2;
            this.L$1 = str;
            this.L$2 = file;
            this.L$3 = brotliDecompressor;
            this.L$4 = r6;
            this.label = 1;
            if (r2.Bhx(this) == r7) {
                return r7;
            }
        } else if (i == 1) {
            r6 = (AnonymousClass708) this.L$4;
            file = (File) this.L$2;
            str = (String) this.L$1;
            r2 = (C35911n2) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        try {
            File A17 = C108945cZ.A17(str);
            String parent = A17.getParent();
            if (parent != null) {
                String A0y = AnonymousClass000.A0y("/temp", AnonymousClass000.A11(parent));
                if (file.exists()) {
                    AnonymousClass9N9 decompress = new TarBrotliDecompressor().decompress(file.getPath(), A0y);
                    File file2 = decompress.A00;
                    if (file2 == null) {
                        String str2 = decompress.A01;
                        if (str2 == null) {
                            str2 = "MLBrotliDecompressor failed";
                        }
                        throw new AnonymousClass6SE(str2);
                    }
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append(file2.getPath());
                    boolean renameTo = C108945cZ.A17(AnonymousClass000.A0y("/source_file", A10)).renameTo(A17);
                    C64062u9.A0K(file2, (Set) null);
                    C64062u9.A0Q(file);
                    if (renameTo) {
                        return new C162178Jk();
                    }
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append(r6.A06);
                    throw new AnonymousClass6SI(AnonymousClass000.A0y(" failed to rename file", A102));
                }
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append(file.getPath());
                throw new FileNotFoundException(AnonymousClass000.A0y(" not exists", A103));
            }
            throw AnonymousClass000.A0k("No parent directory");
        } finally {
            r2.CQ9((Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BrotliDecompressor$process$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
