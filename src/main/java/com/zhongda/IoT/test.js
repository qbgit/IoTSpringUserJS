function getprotocol() {
    var protocol_define = {
        protocol: {
            contentlen: { offset: 1, len: 2, includeht: 1 }, //includeht 为0 不包含头部尾部 1 包含头部和其他
            deviceid: { offset: 3, len: 4 },
            cmd: { offset: 7, len: 2 },
            headfields: {
                len: 8, field: [
                    { name: "time", offset: 9, ftype: "byte", len: 6 },
                    { name: "version", offset: 15, ftype: "byte", len: 1 },
                    { name: "aftercmd", offset: 16, ftype: "byte", len: 1 } //后继指令
                ]
            },
            bodyfields: [
                {
                    //type: string float double uint32 int32 uint16 int16 int8 uint8
                    //ftype bige 大端格式数据 lite小端数据格式
                    des: "上行自动采集命令",
                    cmd: 0x0202,   //
                    dir: "up",  //上行命令
                    field: [
                        { name: "temp", type: "float", ftype: "bige", len: 4 },
                        { name: "high", type: "int16", ftype: "bige", len: 2 },
                        { name: "a", ftype: "float", ftype: "bige", len: 4 }]
                },
                {
                    des: "心跳",
                    cmd: 0x0201, //heart
                    field: [
                        { name: "temp2", type: "float", ftype: "bige", len: 2 },
                        { name: "tt", type: "string", ftype: "", len: 4 }
                    ]
                },
                {
                    des: "登陆包",
                    cmd: 0x0101,
                    field: [
                        { name: "test", type: "integer", ftype: "bige", len: 4 }
                    ]
                }
            ],
            crc: { len: 2 }
        },
        url: "http://192.168.1.237:10011/postdata",//post 数据的远程地址
        push: ["192.168.1.237"],  //数据推流到另外的服务器或者服务器组
        port: "8051" //tcp端口启动为8051
    }
    return JSON.stringify(protocol_define);
};