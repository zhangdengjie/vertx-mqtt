package com.xixi;

public interface MqttClientStatusCallback {
  void onPing();

  void onPingResponseOutTime();
}
