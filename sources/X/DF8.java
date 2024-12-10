package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DF8 implements EDN {
    public boolean BEI(C26552D3s d3s, File file) {
        return true;
    }

    public void C8u(C26552D3s d3s) {
    }

    public void C8v(int i, int i2, int i3, int i4) {
    }

    public void C8w(C26552D3s d3s) {
    }

    public void C8x(C26552D3s d3s) {
    }

    public void C8y(C26552D3s d3s) {
    }

    public void C8z(C26552D3s d3s, int i) {
    }

    public void C90(C26552D3s d3s) {
    }

    public void C91(C26552D3s d3s, Throwable th) {
    }

    public void C92(C26552D3s d3s) {
    }

    public void C29(C26552D3s d3s, int i) {
        C25159CaA caA = ProvidersRegistry.A00;
        HashSet A12 = C17880vN.A12();
        ArrayList arrayList = caA.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                if ((i2 & i) != 0) {
                    A12.add(next);
                }
                i2 <<= 1;
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        Iterator it2 = A12.iterator();
        while (it2.hasNext()) {
            String A0v = C17880vN.A0v(it2);
            if (A10.length() != 0) {
                BE6.A1K(A10);
            }
            A10.append(A0v);
        }
        Buffer buffer = d3s.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 52, 0, 0, 8126514, 0, 0), "Active providers"), A10.toString());
    }

    public void C28(C26552D3s d3s) {
        long nanoTime = System.nanoTime();
        Buffer buffer = d3s.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 83, BufferLogger.writeStandardEntry(buffer, 4, 21, nanoTime, 0, 0, 0, 0), "Profilo.ProvidersInitialized");
        BufferLogger.writeStandardEntry(buffer, 4, 22, nanoTime, 0, 0, 0, 0);
    }
}
