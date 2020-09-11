# vi: set ft=ruby :

ENV['VAGRANT_NO_PARALLEL'] = 'yes'

Vagrant.configure(2) do |config|
  
  config.vm.define "kafkaserver" do |kafkaserver|
    kafkaserver.vm.box = "centos/7"
    kafkaserver.vm.hostname = "kafkaserver.eduami.org"
    kafkaserver.vm.network "private_network", ip: "192.168.50.23"
    kafkaserver.vm.network "forwarded_port", guest: 9021, host: 9021
    kafkaserver.vm.network "forwarded_port", guest: 9092, host: 9092
    kafkaserver.vm.provision "shell", path: "startup-kafkaserver.sh"
    kafkaserver.vm.provider "virtualbox" do |vb|
      vb.name = "kafkaserver"
      vb.memory = 10024
      vb.cpus = 4
    end
  end
end
