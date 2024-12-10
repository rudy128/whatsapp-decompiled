package X;

import com.facebook.smartcapture.camera.PhotoCameraFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;

public final class CXR {
    public PhotoCameraFragment A00;
    public C26559D3z A01;
    public CNV A02;
    public AnonymousClass1IX A03;
    public boolean A04;
    public final long A05;
    public final String A06;
    public final String A07;
    public final CNT A08;

    public CXR(PhotoCameraFragment photoCameraFragment, String str, String str2, Collection collection, long j) {
        C18070vi.A0g(photoCameraFragment, 1, collection);
        this.A00 = photoCameraFragment;
        this.A06 = str;
        this.A05 = j;
        this.A07 = str2;
        if (!collection.isEmpty()) {
            this.A03 = AnonymousClass1IX.copyOf(collection);
        }
        this.A08 = new CNT(collection);
    }

    public void A00() {
        String str = this.A06;
        if (str != null) {
            C63502tC.A01(str);
        }
        this.A04 = false;
        String str2 = this.A07;
        if (str2 != null) {
            C63502tC.A01(str2);
        }
        CNT cnt = this.A08;
        PriorityQueue priorityQueue = cnt.A01;
        Iterator it = priorityQueue.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass000.A0s("getFilePath");
        }
        priorityQueue.clear();
        Iterator it2 = cnt.A00.iterator();
        while (it2.hasNext()) {
            C63502tC.A01(C17880vN.A0v(it2));
        }
    }
}
