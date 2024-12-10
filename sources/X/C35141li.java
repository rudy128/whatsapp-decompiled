package X;

/* renamed from: X.1li  reason: invalid class name and case insensitive filesystem */
public class C35141li {
    public final C25551Oq A00;

    public static void A00(C28791au r4, String str, int i, int i2) {
        ((C28801av) r4).A02.A04("rmr_response_error", "file_key = ?  AND rmr_source =?  AND response_device_id =? ", "RequestMediaReUploadResponseErrorStore.deleteResponseErrorWithDeviceId", new String[]{str, String.valueOf(i), String.valueOf(i2)});
    }

    public C35141li(C25551Oq r1) {
        this.A00 = r1;
    }

    public void A01(String str, int i, int i2) {
        C17960vV.A01();
        C28791au A06 = this.A00.A06();
        try {
            A00(A06, str, i, i2);
            A06.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }
}
