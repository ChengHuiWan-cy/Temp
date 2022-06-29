package com.example.backend.controller;

public class result {

        private String code="20000";
        private Object data;

        public result(Object data){this.data=data;}

        public void setCode(String code) {
            this.code = code;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public String getCode() {
        return code;
    }

        public Object getData() {
            return data;
        }

        public static result ok(Object data)
        {
            return new result(data);
        }

        public static result error(Object data)
        {
            result result1=new result(data);
            result1.setCode("50008");
            return result1;
        }
}

