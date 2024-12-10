package X;

import android.text.TextUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: X.Amx  reason: case insensitive filesystem */
public class C21608Amx extends SSLSocket {
    public final SSLSocket A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass181 A03;

    public synchronized void close() {
        this.A00.close();
    }

    public synchronized int getReceiveBufferSize() {
        return this.A00.getReceiveBufferSize();
    }

    public synchronized int getSendBufferSize() {
        return this.A00.getSendBufferSize();
    }

    public synchronized int getSoTimeout() {
        return this.A00.getSoTimeout();
    }

    public synchronized void setReceiveBufferSize(int i) {
        this.A00.setReceiveBufferSize(i);
    }

    public synchronized void setSendBufferSize(int i) {
        this.A00.setSendBufferSize(i);
    }

    public synchronized void setSoTimeout(int i) {
        this.A00.setSoTimeout(i);
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A00.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public void bind(SocketAddress socketAddress) {
        this.A00.bind(socketAddress);
    }

    public void connect(SocketAddress socketAddress, int i) {
        this.A00.connect(socketAddress, i);
    }

    public SocketChannel getChannel() {
        return this.A00.getChannel();
    }

    public boolean getEnableSessionCreation() {
        return this.A00.getEnableSessionCreation();
    }

    public String[] getEnabledCipherSuites() {
        return this.A00.getEnabledCipherSuites();
    }

    public String[] getEnabledProtocols() {
        return this.A00.getEnabledProtocols();
    }

    public InetAddress getInetAddress() {
        return this.A00.getInetAddress();
    }

    public InputStream getInputStream() {
        return new C179229Hb(this.A03, this.A00.getInputStream(), Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    public boolean getKeepAlive() {
        return this.A00.getKeepAlive();
    }

    public InetAddress getLocalAddress() {
        return this.A00.getLocalAddress();
    }

    public int getLocalPort() {
        return this.A00.getLocalPort();
    }

    public SocketAddress getLocalSocketAddress() {
        return this.A00.getLocalSocketAddress();
    }

    public boolean getNeedClientAuth() {
        return this.A00.getNeedClientAuth();
    }

    public boolean getOOBInline() {
        return this.A00.getOOBInline();
    }

    public OutputStream getOutputStream() {
        return new C179259He(this.A03, this.A00.getOutputStream(), Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    public int getPort() {
        return this.A00.getPort();
    }

    public SocketAddress getRemoteSocketAddress() {
        return this.A00.getRemoteSocketAddress();
    }

    public boolean getReuseAddress() {
        return this.A00.getReuseAddress();
    }

    public SSLParameters getSSLParameters() {
        return this.A00.getSSLParameters();
    }

    public SSLSession getSession() {
        return this.A00.getSession();
    }

    public int getSoLinger() {
        return this.A00.getSoLinger();
    }

    public String[] getSupportedCipherSuites() {
        return this.A00.getSupportedCipherSuites();
    }

    public String[] getSupportedProtocols() {
        return this.A00.getSupportedProtocols();
    }

    public boolean getTcpNoDelay() {
        return this.A00.getTcpNoDelay();
    }

    public int getTrafficClass() {
        return this.A00.getTrafficClass();
    }

    public boolean getUseClientMode() {
        return this.A00.getUseClientMode();
    }

    public boolean getWantClientAuth() {
        return this.A00.getWantClientAuth();
    }

    public boolean isBound() {
        return this.A00.isBound();
    }

    public boolean isClosed() {
        return this.A00.isClosed();
    }

    public boolean isConnected() {
        return this.A00.isConnected();
    }

    public boolean isInputShutdown() {
        return this.A00.isInputShutdown();
    }

    public boolean isOutputShutdown() {
        return this.A00.isOutputShutdown();
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A00.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public void sendUrgentData(int i) {
        this.A00.sendUrgentData(i);
    }

    public void setEnableSessionCreation(boolean z) {
        this.A00.setEnableSessionCreation(z);
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.A00.setEnabledCipherSuites(strArr);
    }

    public void setEnabledProtocols(String[] strArr) {
        String[] strArr2;
        SSLSocket sSLSocket = this.A00;
        int length = strArr.length;
        if (length >= 1) {
            if (length != 1) {
                strArr2 = strArr;
            } else if ("SSLv3".equals(strArr[0])) {
                strArr2 = sSLSocket.getSupportedProtocols();
            }
            ArrayList A13 = AnonymousClass000.A13();
            for (String str : strArr2) {
                if (!"SSLv3".equals(str)) {
                    A13.add(str);
                }
            }
            if (length != A13.size() || length == 1) {
                C17890vO.A1A(AnonymousClass000.A11("accounting-socket/set-enabled-protocols/current-list: "), TextUtils.join(", ", strArr));
                C17890vO.A1A(AnonymousClass000.A11("accounting-socket/set-enabled-protocols/modified-list: "), TextUtils.join(", ", A13));
            } else {
                TextUtils.join(", ", strArr);
                TextUtils.join(", ", A13);
            }
            if (!A13.isEmpty()) {
                strArr = C17890vO.A1b(A13, 0);
            }
            sSLSocket.setEnabledProtocols(strArr);
        }
        C17890vO.A1A(AnonymousClass000.A11("accounting-socket/set-enabled-protocols/current-list: "), TextUtils.join(", ", strArr));
        sSLSocket.setEnabledProtocols(strArr);
    }

    public void setKeepAlive(boolean z) {
        this.A00.setKeepAlive(z);
    }

    public void setNeedClientAuth(boolean z) {
        this.A00.setNeedClientAuth(z);
    }

    public void setOOBInline(boolean z) {
        this.A00.setOOBInline(z);
    }

    public void setPerformancePreferences(int i, int i2, int i3) {
        this.A00.setPerformancePreferences(i, i2, i3);
    }

    public void setReuseAddress(boolean z) {
        this.A00.setReuseAddress(z);
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        this.A00.setSSLParameters(sSLParameters);
    }

    public void setSoLinger(boolean z, int i) {
        this.A00.setSoLinger(z, i);
    }

    public void setTcpNoDelay(boolean z) {
        this.A00.setTcpNoDelay(z);
    }

    public void setTrafficClass(int i) {
        this.A00.setTrafficClass(i);
    }

    public void setUseClientMode(boolean z) {
        this.A00.setUseClientMode(z);
    }

    public void setWantClientAuth(boolean z) {
        this.A00.setWantClientAuth(z);
    }

    public void shutdownInput() {
        this.A00.shutdownInput();
    }

    public void shutdownOutput() {
        this.A00.shutdownOutput();
    }

    public void startHandshake() {
        try {
            this.A00.startHandshake();
        } catch (SSLHandshakeException | SSLProtocolException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("accounting-socket-factory/enabled suites ");
            SSLSocket sSLSocket = this.A00;
            A10.append(Arrays.toString(sSLSocket.getEnabledCipherSuites()));
            A10.append(" supported suites ");
            C17890vO.A19(A10, Arrays.toString(sSLSocket.getSupportedCipherSuites()));
            throw e;
        }
    }

    public String toString() {
        return this.A00.toString();
    }

    public C21608Amx(AnonymousClass181 r1, SSLSocket sSLSocket, int i, int i2) {
        this.A01 = i;
        this.A00 = sSLSocket;
        this.A03 = r1;
        this.A02 = i2;
    }

    public void connect(SocketAddress socketAddress) {
        this.A00.connect(socketAddress);
    }
}
