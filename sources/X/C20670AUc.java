package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.AUc  reason: case insensitive filesystem */
public class C20670AUc implements C22554BCn {
    public final /* synthetic */ C186699ec A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ File A03;

    public /* synthetic */ void Bpi(String str) {
    }

    public /* synthetic */ void Bpq() {
    }

    public C20670AUc(C186699ec r1, File file, File file2, File file3) {
        this.A00 = r1;
        this.A03 = file;
        this.A02 = file2;
        this.A01 = file3;
    }

    public void Bqr(long j) {
        this.A03.delete();
        this.A02.delete();
        this.A01.delete();
    }

    public void Bt0(String str) {
        C17900vP.A0e("MemoryExceptionsUploadHelper/Error: ", str, AnonymousClass000.A10());
    }

    public void C3W(String str, Map map) {
    }
}
