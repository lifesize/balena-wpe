FROM bobbybeckmann/resin-wpe:latest

COPY wpe-init /wpe-init

CMD [ "/wpe-init" ]
